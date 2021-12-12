package com.example.sierranevadatrailsproject

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class FeedReaderDbHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        createTables(db)
        fillAllTables(db)
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        createTables(db)
        fillAllTables(db)
        onCreate(db)
    }
    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }

    private fun fillAllTables(db: SQLiteDatabase) {
        val fillTables:String = "--Inserts values into the tables\n" +
                "\n" +
                "INSERT INTO Location (l_name, l_locationkey, l_information)\n" +
                "    VALUES\n" +
                "    (\"Calaveras County\", 1, \"Information\"),\n" +
                "    (\"Tuolumne County\", 2, \"Information\"),\n" +
                "    (\"Yosemite National Park\", 3, \"Information\"),\n" +
                "    (\"Devils Postpile National Monument\", 4, \"Information\"),\n" +
                "    (\"Inyo National Forest\", 5, \"Information\"),\n" +
                "    (\"Sierra National Forest\", 6, \"Information\"),\n" +
                "    (\"Kings Canyon National Park\", 7, \"Information\"),\n" +
                "    (\"Sequoia National Park\", 8, \"Information\"),\n" +
                "    (\"Sequoia National Forest\", 9, \"Information\")\n" +
                ";    \n" +
                "\n" +
                "INSERT INTO Difficulty (d_name, d_diffkey, d_information)\n" +
                "    VALUES\n" +
                "    (\"Very Easy\", 1, \"Shorter trails, very flat. No obstacles\"),\n" +
                "    (\"Easy\", 2, \"Short trails, moderately flat. Few obstacles\"),\n" +
                "    (\"Medium\", 3, \"Moderate trails, some elevation. May contain obstacles\"),\n" +
                "    (\"Hard\", 4, \"Longer trails, high elevation variance. Will encounter obstacles\"),\n" +
                "    (\"Expert\", 5, \"Extremely long trails, high elevation varience. Lots of obstacles\")\n" +
                ";\n" +
                "\n" +
                "INSERT INTO Trail (t_key, t_name, t_diffkey, t_locationkey, t_location, t_length, t_modekey, t_information)\n" +
                "    VALUES\n" +
                "    (1, \"North Grove\", 1, 1, \"Calaveras County\", 1.5, 1, \"Information\"),\n" +
                "    (2, \"Upper Natural Bridge Trail\", 2, 1, \"Calaveras County\", 2, 1, \"Information\"),\n" +
                "    (3, \"Dragoon Gulch Trail\", 2, 2, \"Tuolumne County\", 2.5, 1, \"Information\"),\n" +
                "    (4, \"Hetch Hetchy Reservoir and Wapama Falls\", 3, 2, \"Tuolumne County\", 5, 1, \"Information\"),\n" +
                "    (5, \"May Lake\", 2, 3, \"Yosemite National Park\", 5, 1, \"Information\"),\n" +
                "    (6, \"Mirror Lake\", 1, 3, \"Yosemite National Park\", 2.4, 1, \"Information\"),\n" +
                "    (7, \"Happy Isles\", 1, 3, \"Yosemite National Park\", 0.75, 1, \"Information\"),\n" +
                "    (8, \"Half Dome\", 4, 3, \"Yosemite National Park\", 16, 3, \"Information\"),\n" +
                "    (9, \"The Mist Trail\", 2, 3, \"Yosemite National Park\", 3, 1, \"Information\"),\n" +
                "    (10, \"Panorama Trail\", 3, 3, \"Yosemite National Park\", 9.4, 1, \"Information\"),\n" +
                "    (11, \"Glacier Point\", 1, 3, \"Yosemite National Park\", 0.5, 1, \"Information\"),\n" +
                "    (12, \"Columbia Rock\", 2, 3, \"Yosemite National Park\", 2.2, 1, \"Information\"),\n" +
                "    (13, \"Yosemite Falls Trail\", 2, 3, \"Yosemite National Park\", 5, 1, \"Information\"),\n" +
                "    (14, \"Lower Yosemite Fall\", 1, 3, \"Yosemite National Park\", 1.2, 1, \"Information\"),\n" +
                "    (15, \"Taft Point\", 1, 3, \"Yosemite National Park\", 2, 1, \"Information\"),\n" +
                "    (16, \"Bridalveil Fall\", 1, 3, \"Yosemite National Park\", 0.5, 1, \"Information\"),\n" +
                "    (17, \"Wildcat Falls\", 1, 3, \"Yosemite National Park\", 0.15, 1, \"Information\"),\n" +
                "    (18, \"Chilnualna Falls\", 3, 3, \"Yosemite National Park\", 8, 1, \"Information\"),\n" +
                "    (19, \"Wawaona Swinging Bridge\", 1, 3, \"Yosemite National Park\", 1, 1, \"Information\"),\n" +
                "    (20, \"Wawona Medow Loop Trail\", 2, 3, \"Yosemite National Park\", 3.6, 1, \"Information\"),\n" +
                "    (21, \"Mariposa Grove of Giant Sequoias\", 2, 3, \"Yosemite National Park\", 3, 1, \"Information\"),\n" +
                "    (22, \"Devils Postpile\", 1, 4, \"Devils Postpile National Monument\", 1, 1, \"Information\"),\n" +
                "    (23, \"Rainbow Falls\", 2, 4, \"Devils Postpile National Monument\", 5, 1, \"Information\"),\n" +
                "    (24, \"Minaret Falls\", 1, 4, \"Devils Postpile National Monument\", 3, 1, \"Information\"),\n" +
                "    (25, \"Thousand Island Lake\", 4, 5, \"Inyo National Forest\", 18, 1, \"Information\"),\n" +
                "    (26, \"Shadow Lake\", 3, 5, \"Inyo National Forest\", 8.5, 1, \"Information\"),\n" +
                "    (27, \"Ediza Lake\", 4, 5, \"Inyo National Forest\", 15, 1, \"Information\"),\n" +
                "    (28, \"Ediza Lake - Thousand Island Lake Loop\", 5, 5, \"Inyo National Forest\", 25, 3, \"Information\"),\n" +
                "    (29, \"Garnet Lake\", 4, 5, \"Inyo National Forest\", 17.1, 3, \"Information\"),\n" +
                "    (30, \"Cottonwood Pass\", 2, 5, \"Inyo National Forest\", 7, 1, \"Information\"),\n" +
                "    (31, \"Chicken Spring Lake\", 3, 5, \"Inyo National Forest\", 8.2, 1, \"Information\"),\n" +
                "    (32, \"Old Cottonwood Creek Trail\", 3, 5, \"Inyo National Forest\", 8.5, 1, \"Information\"),\n" +
                "    (33, \"Cottonwood Lakes\", 4, 5, \"Inyo National Forest\", 12.5, 1, \"Information\"),\n" +
                "    (34, \"Cirque Peak\", 5, 5, \"Inyo National Forest\", 17, 1, \"Information\"),\n" +
                "    (35, \"Lower Soldier Lake\", 4, 5, \"Inyo National Forest\", 20, 3, \"Information\"),\n" +
                "    (36, \"Mount Langley\", 5, 5, \"Inyo National Forest\", 22, 3, \"Information\"),\n" +
                "    (37, \"Sky Blue Lake\", 5, 5, \"Inyo National Forest\", 26, 3, \"Information\"),\n" +
                "    (38, \"Primrose Lake\", 5, 5, \"Inyo National Forest\", 28, 3, \"Information\"),\n" +
                "    (39, \"Mount Pickering\", 5, 5, \"Inyo National Forest\", 30, 3, \"Information\"),\n" +
                "    (40, \"Bull Buck Tree Trail\", 1, 6, \"Sierra National Forest\", 0.8, 1, \"Information\"),\n" +
                "    (41, \"Big Ed Tree Trail\", 1, 6, \"Sierra National Forest\", 0.2, 1, \"Information\"),\n" +
                "    (42, \"Shadow of the Giants Trail\", 1, 6, \"Sierra National Forest\", 1.1, 1, \"Information\"),\n" +
                "    (43, \"Lewis Creek Trail\", 1, 6, \"Sierra National Forest\", 0.8, 1, \"Information\"),\n" +
                "    (44, \"Way of the Mono Trail\", 1, 6, \"Sierra National Forest\", 0.6, 1, \"Information\"),\n" +
                "    (45, \"Roaring River Falls\", 1, 7, \"Kings Canyon National Park\", 0.3, 1, \"Information\"),\n" +
                "    (46, \"Kanawyer Loop Trail\", 2, 7, \"Kings Canyon National Park\", 5, 1, \"Information\"),\n" +
                "    (47, \"Panoramic Point\", 1, 7, \"Kings Canyon National Park\", 0.5, 1, \"Information\"),\n" +
                "    (48, \"North Boundary Trail\", 2, 7, \"Kings Canyon National Park\", 3.5, 1, \"Information\"),\n" +
                "    (49, \"General Grant Tree Trail\", 1, 7, \"Kings Canyon National Park\", 0.8, 1, \"Information\"),\n" +
                "    (50, \"North Grove Trail\", 1, 7, \"Kings Canyon National Park\", 2, 1, \"Information\"),\n" +
                "    (51, \"Dead Giant Loop Trail\", 1, 7, \"Kings Canyon National Park\", 2.3, 1, \"Information\"),\n" +
                "    (52, \"Grant Village to Grant Grove Trail\", 1, 7, \"Kings Canyon National Park\", 2, 1, \"Information\"),\n" +
                "    (53, \"Buena Vista Peak\", 1, 7, \"Kings Canyon National Park\", 2, 1, \"Information\"),\n" +
                "    (54, \"Hart Tree and Fallen Goliath Loop\", 3, 7, \"Kings Canyon National Park\", 8.3, 1, \"Information\"),\n" +
                "    (55, \"Tokopah Falls\", 2, 8, \"Sequoia National Park\", 4.2, 1, \"Information\"),\n" +
                "    (56, \"General Sherman Tree\", 1, 8, \"Sequoia National Park\", 1, 1, \"Information\"),\n" +
                "    (57, \"Congress Loop\", 1, 8, \"Sequoia National Park\", 2, 1, \"Information\"),\n" +
                "    (58, \"Sunset Rock\", 1, 8, \"Sequoia National Park\", 2, 1, \"Information\"),\n" +
                "    (59, \"Big Trees Trail\", 1, 8, \"Sequoia National Park\", 1.4, 1, \"Information\"),\n" +
                "    (60, \"Beetle Rock\", 1, 8, \"Sequoia National Park\", 0.25, 1, \"Information\"),\n" +
                "    (61, \"Crescent Meadow\", 1, 8, \"Sequoia National Park\", 1.6, 1, \"Information\"),\n" +
                "    (62, \"Sugar Pine and Bobcat Point Trails Loop\", 1.5, 8, \"Sequoia National Park\", 2, 1, \"Information\"),\n" +
                "    (63, \"Hanging Rock Trail\", 1, 8, \"Sequoia National Park\", 0.35, 1, \"Information\"),\n" +
                "    (64, \"Moro Rock\", 1, 8, \"Sequoia National Park\", 0.6, 1, \"Information\"),\n" +
                "    (65, \"Marble Falls\", 2, 8, \"Sequoia National Park\", 8, 1, \"Information\"),\n" +
                "    (66, \"Paradise Creek\", 1, 8, \"Sequoia National Park\", 3, 1, \"Information\"),\n" +
                "    (67, \"Panther Creek\", 2, 8, \"Sequoia National Park\", 6, 1, \"Information\"),\n" +
                "    (68, \"Hockett Trail\", 2, 8, \"Sequoia National Park\", 4, 1, \"Information\"),\n" +
                "    (69, \"Eagle Lake Trail\", 2, 8, \"Sequoia National Park\", 7.2, 1, \"Information\"),\n" +
                "    (70, \"Monarch Lakes Trail\", 3, 8, \"Sequoia National Park\", 9.4, 1, \"Information\"),\n" +
                "    (71, \"Mount Pickering\", 5, 8, \"Sequoia National Park\", 30, 3, \"Information\"),\n" +
                "    (72, \"Mount Langley\", 5, 8, \"Sequoia National Park\", 22, 3, \"Information\"),\n" +
                "    (73, \"Grizzly Falls\", 1, 9, \"Sequoia National Forest\", 0.1, 1, \"Information\"),\n" +
                "    (74, \"Needles Lookout\", 2, 9, \"Sequoia National Forest\", 5, 1, \"Information\"),\n" +
                "    (75, \"Dome Rock\", 1, 9, \"Sequoia National Forest\", 0.5, 1, \"Information\"),\n" +
                "    (76, \"Natural Water Slide\", 1, 9, \"Sequoia National Forest\", 1.5, 1, \"Information\"),\n" +
                "    (77, \"Trail of 100 Giants\", 1, 9, \"Sequoia National Forest\", 1.3, 1, \"Information\")\n" +
                ";\n" +
                "\n" +
                "INSERT INTO Mode (m_modekey, m_name, m_information)\n" +
                "    VALUES\n" +
                "    (1, \"Hiking\", \"Information\"),\n" +
                "    (2, \"Biking\", \"Information\"),\n" +
                "    (3, \"Backpacking\", \"Information\")\n" +
                ";"

        db.execSQL(fillTables)
    }

    private fun createTables(db: SQLiteDatabase) {
        val createTableSQL: String =
                "CREATE TABLE IF NOT EXISTS Location (\n" +
                "    l_name              varchar(30)     not null,\n" +
                "    l_locationkey       int             not null,\n" +
                "    l_information       varchar(100)    not null\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS Difficulty (\n" +
                "    d_name              varchar(10)     not null,\n" +
                "    d_diffkey           int             not null,\n" +
                "    d_information       varchar(100)    not null\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS Trail (\n" +
                "    t_key               int             PRIMARY KEY AUTOINCREMENT,\n" +
                "    t_name              varchar(30)     not null,\n" +
                "    t_diffkey           int             not null,\n" +
                "    t_locationkey       int             not null,\n" +
                "    t_location          varchar(30)     not null,\n" +
                "    t_length            decimal(3,1)    not null,\n" +
                "    t_modekey           int             not null,\n" +
                "    t_information       varchar(100)    not null\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS User (\n" +
                "    u_key               int             PRIMARY KEY AUTOINCREMENT,\n" +
                "    u_username          varchar(20)     not null,\n" +
                "    u_password          varchar(30)     not null,\n" +
                "    u_name              varchar(30)     not null,\n" +
                "    u_inventorykey      int             not null,\n" +
                "    u_diffkey           int             not null,\n" +
                "    u_prefmode          varchar(10)     not null\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS UserInventory(\n" +
                "    ui_inventorykey     int             PRIMARY KEY AUTOINCREMENT},\n" +
                "    ui_eqkey            int             not null,\n" +
                "    ui_qty              int             not null,\n" +
                "    ui_information      varchar(100)    not null\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS Mode (\n" +
                "    m_modekey           int             not null,\n" +
                "    m_name              varchar(30)     not null,\n" +
                "    m_information       varchar(100)    not null\n" +
                ");\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS Equipment (\n" +
                "    e_name              varchar(30)     not null,\n" +
                "    e_eqkey             int             not null,\n" +
                "    e_modekey           int             not null,\n" +
                "    e_diffkey           int             not null,\n" +
                "    e_information       varchar(100)    not null\n" +
                ");"

        db.execSQL(createTableSQL)
    }

    //Debugging and testing purposes
    private fun deleteTables(db: SQLiteDatabase) {
        val deleteTablesSQL = "DROP TABLE Difficulty;\n" +
                "DROP TABLE Equipment;\n" +
                "DROP TABLE Location;\n" +
                "DROP TABLE Mode;\n" +
                "DROP TABLE Trail;\n" +
                "DROP TABLE User;\n" +
                "DROP TABLE UserInventory;"

        db.execSQL(deleteTablesSQL)
    }

    fun readAllData() : Cursor {
        val TABLENAME: String = "Trail"
        val sql: String = "SELECT * FROM $TABLENAME"
        val db: SQLiteDatabase = this.readableDatabase

        lateinit var cursor:Cursor

        if (db != null) {
            cursor = db.rawQuery(sql, null)
        }
        return cursor
    }

    companion object {
        // If you change the database schema, you must increment the database version.
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "FeedReader.db"
    }
}