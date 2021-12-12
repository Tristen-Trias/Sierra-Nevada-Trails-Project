.headers on
--Creates all tables

CREATE TABLE IF NOT EXISTS Location (
    l_name              varchar(30)     not null,
    l_locationkey       int             not null,
    l_information       varchar(100)    not null
);

CREATE TABLE IF NOT EXISTS Difficulty (
    d_name              varchar(10)     not null,
    d_diffkey           int             not null,
    d_information       varchar(100)    not null
);

CREATE TABLE IF NOT EXISTS Trail (
    t_key               int             PRIMARY KEY AUTOINCREMENT,
    t_name              varchar(30)     not null,
    t_diffkey           int             not null,
    t_locationkey       int             not null,
    t_location          varchar(30)     not null,
    t_length            decimal(3,1)    not null,
    t_modekey           int             not null,
    t_information       varchar(100)    not null
);

CREATE TABLE IF NOT EXISTS User (
    u_key               int             PRIMARY KEY AUTOINCREMENT,
    u_username          varchar(20)     not null,
    u_password          varchar(30)     not null,
    u_name              varchar(30)     not null,
    u_inventorykey      int             not null,
    u_diffkey           int             not null,
    u_prefmode          varchar(10)     not null
);

CREATE TABLE IF NOT EXISTS UserInventory(
    ui_inventorykey     int             PRIMARY KEY AUTOINCREMENT,
    ui_eqkey            int             not null,
    ui_qty              int             not null,
    ui_information      varchar(100)    not null
);

CREATE TABLE IF NOT EXISTS Mode (
    m_modekey           int             not null,
    m_name              varchar(30)     not null,
    m_information       varchar(100)    not null
);

CREATE TABLE IF NOT EXISTS Equipment (
    e_name              varchar(30)     not null,
    e_eqkey             int             not null,
    e_modekey           int             not null,
    e_diffkey           int             not null,
    e_information       varchar(100)    not null
);