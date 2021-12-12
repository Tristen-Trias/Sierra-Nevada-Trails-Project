package com.example.sierranevadatrailsproject

import android.database.Cursor
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_trails.view.*

class trails : Fragment() {
    private var layoutMan: RecyclerView.LayoutManager? = null
    private var adapt: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    lateinit var db: FeedReaderDbHelper
    lateinit var key: ArrayList<String>
    lateinit var name: ArrayList<String>
    lateinit var diffkey: ArrayList<String>
    lateinit var locationkey: ArrayList<String>
    lateinit var location: ArrayList<String>
    lateinit var length: ArrayList<String>
    lateinit var modekey: ArrayList<String>
    lateinit var information: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        db = FeedReaderDbHelper(this.requireContext())
        key = arrayListOf<String>()
        name = arrayListOf<String>()
        diffkey = arrayListOf<String>()
        locationkey = arrayListOf<String>()
        location = arrayListOf<String>()
        length = arrayListOf<String>()
        modekey = arrayListOf<String>()
        information = arrayListOf<String>()

        storeData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_trails, container, false)
        setRecycler(view)
        setButtons(view)



        return view
    }

    private fun setRecycler(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.trailsView)
        layoutMan = LinearLayoutManager(this.requireContext())
        recyclerView.layoutManager = layoutMan

        adapt = RecyclerAdapter()
        recyclerView.adapter = adapt
    }

    private fun setButtons(view: View) {
        view.fragment_trails.trails_back.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.trailsToLogin)
        }

        view.fragment_trails.toInventory.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.trailsToInventory)
        }

        view.fragment_trails.toSettings.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.trailsToSettings)
        }
    }

    private fun storeData() {
        var cursor: Cursor? = db.readAllData()
        if (cursor != null) {
            if (cursor.count == 0) {
                Toast.makeText(this.requireContext(), "No data", Toast.LENGTH_SHORT).show()
            } else {
                while (cursor.moveToNext()) {
                    key.add(cursor.getString(0))
                    name.add(cursor.getString(1))
                    diffkey.add(cursor.getString(2))
                    locationkey.add(cursor.getString(3))
                    location.add(cursor.getString(4))
                    length.add(cursor.getString(5))
                    modekey.add(cursor.getString(6))
                    information.add(cursor.getString(7))
                }
            }
        }
    }

}