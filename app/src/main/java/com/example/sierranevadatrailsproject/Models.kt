package com.example.sierranevadatrailsproject

class User {
    var u_key : Int = 0
    var u_username : String = ""
    var u_password : String = ""
    var u_name : String = ""
    var u_inventorykey : Int = 0
    var u_diffkey : Int = 0
    var u_prefmode : String = ""
}

class UserInventory {
    var ui_inventorykey : Int = 0
    var ui_eqkey : Int = 0
    var ui_qty : Int = 0
    var ui_information : String = ""
}

class Equipment {
    var e_name : String = ""
    var e_eqkey : Int = 0;
    var e_modekey : Int = 0;
    var e_diffkey : Int = 0;
    var e_information : String = ""
}

class Trail {
    var t_key : Int = 0
    var t_name : String = ""
    var t_diffkey : Int = 0
    var t_locationkey : Int = 0
    var t_location : String = ""
    var t_length : Double = 0.0
    var t_modekey : Int = 0
    var t_information : String = ""
    var t_url : String = ""
}