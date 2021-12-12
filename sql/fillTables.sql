--Inserts values into the tables

INSERT INTO Location (l_name, l_locationkey, l_information)
    VALUES
    ("Calaveras County", 1, "Information"),
    ("Tuolumne County", 2, "Information"),
    ("Yosemite National Park", 3, "Information"),
    ("Devils Postpile National Monument", 4, "Information"),
    ("Inyo National Forest", 5, "Information"),
    ("Sierra National Forest", 6, "Information"),
    ("Kings Canyon National Park", 7, "Information"),
    ("Sequoia National Park", 8, "Information"),
    ("Sequoia National Forest", 9, "Information")
;    

INSERT INTO Difficulty (d_name, d_diffkey, d_information)
    VALUES
    ("Very Easy", 1, "Shorter trails, very flat. No obstacles"),
    ("Easy", 2, "Short trails, moderately flat. Few obstacles"),
    ("Medium", 3, "Moderate trails, some elevation. May contain obstacles"),
    ("Hard", 4, "Longer trails, high elevation variance. Will encounter obstacles"),
    ("Expert", 5, "Extremely long trails, high elevation varience. Lots of obstacles")
;

INSERT INTO Trail (t_key, t_name, t_diffkey, t_locationkey, t_location, t_length, t_modekey, t_information)
    VALUES
    (1, "North Grove", 1, 1, "Calaveras County", 1.5, 1, "Information"),
    (2, "Upper Natural Bridge Trail", 2, 1, "Calaveras County", 2, 1, "Information"),
    (3, "Dragoon Gulch Trail", 2, 2, "Tuolumne County", 2.5, 1, "Information"),
    (4, "Hetch Hetchy Reservoir and Wapama Falls", 3, 2, "Tuolumne County", 5, 1, "Information"),
    (5, "May Lake", 2, 3, "Yosemite National Park", 5, 1, "Information"),
    (6, "Mirror Lake", 1, 3, "Yosemite National Park", 2.4, 1, "Information"),
    (7, "Happy Isles", 1, 3, "Yosemite National Park", 0.75, 1, "Information"),
    (8, "Half Dome", 4, 3, "Yosemite National Park", 16, 3, "Information"),
    (9, "The Mist Trail", 2, 3, "Yosemite National Park", 3, 1, "Information"),
    (10, "Panorama Trail", 3, 3, "Yosemite National Park", 9.4, 1, "Information"),
    (11, "Glacier Point", 1, 3, "Yosemite National Park", 0.5, 1, "Information"),
    (12, "Columbia Rock", 2, 3, "Yosemite National Park", 2.2, 1, "Information"),
    (13, "Yosemite Falls Trail", 2, 3, "Yosemite National Park", 5, 1, "Information"),
    (14, "Lower Yosemite Fall", 1, 3, "Yosemite National Park", 1.2, 1, "Information"),
    (15, "Taft Point", 1, 3, "Yosemite National Park", 2, 1, "Information"),
    (16, "Bridalveil Fall", 1, 3, "Yosemite National Park", 0.5, 1, "Information"),
    (17, "Wildcat Falls", 1, 3, "Yosemite National Park", 0.15, 1, "Information"),
    (18, "Chilnualna Falls", 3, 3, "Yosemite National Park", 8, 1, "Information"),
    (19, "Wawaona Swinging Bridge", 1, 3, "Yosemite National Park", 1, 1, "Information"),
    (20, "Wawona Medow Loop Trail", 2, 3, "Yosemite National Park", 3.6, 1, "Information"),
    (21, "Mariposa Grove of Giant Sequoias", 2, 3, "Yosemite National Park", 3, 1, "Information"),
    (22, "Devils Postpile", 1, 4, "Devils Postpile National Monument", 1, 1, "Information"),
    (23, "Rainbow Falls", 2, 4, "Devils Postpile National Monument", 5, 1, "Information"),
    (24, "Minaret Falls", 1, 4, "Devils Postpile National Monument", 3, 1, "Information"),
    (25, "Thousand Island Lake", 4, 5, "Inyo National Forest", 18, 1, "Information"),
    (26, "Shadow Lake", 3, 5, "Inyo National Forest", 8.5, 1, "Information"),
    (27, "Ediza Lake", 4, 5, "Inyo National Forest", 15, 1, "Information"),
    (28, "Ediza Lake - Thousand Island Lake Loop", 5, 5, "Inyo National Forest", 25, 3, "Information"),
    (29, "Garnet Lake", 4, 5, "Inyo National Forest", 17.1, 3, "Information"),
    (30, "Cottonwood Pass", 2, 5, "Inyo National Forest", 7, 1, "Information"),
    (31, "Chicken Spring Lake", 3, 5, "Inyo National Forest", 8.2, 1, "Information"),
    (32, "Old Cottonwood Creek Trail", 3, 5, "Inyo National Forest", 8.5, 1, "Information"),
    (33, "Cottonwood Lakes", 4, 5, "Inyo National Forest", 12.5, 1, "Information"),
    (34, "Cirque Peak", 5, 5, "Inyo National Forest", 17, 1, "Information"),
    (35, "Lower Soldier Lake", 4, 5, "Inyo National Forest", 20, 3, "Information"),
    (36, "Mount Langley", 5, 5, "Inyo National Forest", 22, 3, "Information"),
    (37, "Sky Blue Lake", 5, 5, "Inyo National Forest", 26, 3, "Information"),
    (38, "Primrose Lake", 5, 5, "Inyo National Forest", 28, 3, "Information"),
    (39, "Mount Pickering", 5, 5, "Inyo National Forest", 30, 3, "Information"),
    (40, "Bull Buck Tree Trail", 1, 6, "Sierra National Forest", 0.8, 1, "Information"),
    (41, "Big Ed Tree Trail", 1, 6, "Sierra National Forest", 0.2, 1, "Information"),
    (42, "Shadow of the Giants Trail", 1, 6, "Sierra National Forest", 1.1, 1, "Information"),
    (43, "Lewis Creek Trail", 1, 6, "Sierra National Forest", 0.8, 1, "Information"),
    (44, "Way of the Mono Trail", 1, 6, "Sierra National Forest", 0.6, 1, "Information"),
    (45, "Roaring River Falls", 1, 7, "Kings Canyon National Park", 0.3, 1, "Information"),
    (46, "Kanawyer Loop Trail", 2, 7, "Kings Canyon National Park", 5, 1, "Information"),
    (47, "Panoramic Point", 1, 7, "Kings Canyon National Park", 0.5, 1, "Information"),
    (48, "North Boundary Trail", 2, 7, "Kings Canyon National Park", 3.5, 1, "Information"),
    (49, "General Grant Tree Trail", 1, 7, "Kings Canyon National Park", 0.8, 1, "Information"),
    (50, "North Grove Trail", 1, 7, "Kings Canyon National Park", 2, 1, "Information"),
    (51, "Dead Giant Loop Trail", 1, 7, "Kings Canyon National Park", 2.3, 1, "Information"),
    (52, "Grant Village to Grant Grove Trail", 1, 7, "Kings Canyon National Park", 2, 1, "Information"),
    (53, "Buena Vista Peak", 1, 7, "Kings Canyon National Park", 2, 1, "Information"),
    (54, "Hart Tree and Fallen Goliath Loop", 3, 7, "Kings Canyon National Park", 8.3, 1, "Information"),
    (55, "Tokopah Falls", 2, 8, "Sequoia National Park", 4.2, 1, "Information"),
    (56, "General Sherman Tree", 1, 8, "Sequoia National Park", 1, 1, "Information"),
    (57, "Congress Loop", 1, 8, "Sequoia National Park", 2, 1, "Information"),
    (58, "Sunset Rock", 1, 8, "Sequoia National Park", 2, 1, "Information"),
    (59, "Big Trees Trail", 1, 8, "Sequoia National Park", 1.4, 1, "Information"),
    (60, "Beetle Rock", 1, 8, "Sequoia National Park", 0.25, 1, "Information"),
    (61, "Crescent Meadow", 1, 8, "Sequoia National Park", 1.6, 1, "Information"),
    (62, "Sugar Pine and Bobcat Point Trails Loop", 1.5, 8, "Sequoia National Park", 2, 1, "Information"),
    (63, "Hanging Rock Trail", 1, 8, "Sequoia National Park", 0.35, 1, "Information"),
    (64, "Moro Rock", 1, 8, "Sequoia National Park", 0.6, 1, "Information"),
    (65, "Marble Falls", 2, 8, "Sequoia National Park", 8, 1, "Information"),
    (66, "Paradise Creek", 1, 8, "Sequoia National Park", 3, 1, "Information"),
    (67, "Panther Creek", 2, 8, "Sequoia National Park", 6, 1, "Information"),
    (68, "Hockett Trail", 2, 8, "Sequoia National Park", 4, 1, "Information"),
    (69, "Eagle Lake Trail", 2, 8, "Sequoia National Park", 7.2, 1, "Information"),
    (70, "Monarch Lakes Trail", 3, 8, "Sequoia National Park", 9.4, 1, "Information"),
    (71, "Mount Pickering", 5, 8, "Sequoia National Park", 30, 3, "Information"),
    (72, "Mount Langley", 5, 8, "Sequoia National Park", 22, 3, "Information"),
    (73, "Grizzly Falls", 1, 9, "Sequoia National Forest", 0.1, 1, "Information"),
    (74, "Needles Lookout", 2, 9, "Sequoia National Forest", 5, 1, "Information"),
    (75, "Dome Rock", 1, 9, "Sequoia National Forest", 0.5, 1, "Information"),
    (76, "Natural Water Slide", 1, 9, "Sequoia National Forest", 1.5, 1, "Information"),
    (77, "Trail of 100 Giants", 1, 9, "Sequoia National Forest", 1.3, 1, "Information")
;

INSERT INTO Mode (m_modekey, m_name, m_information)
    VALUES
    (1, "Hiking", "Information"),
    (2, "Biking", "Information"),
    (3, "Backpacking", "Information")
;

INSERT INTO User(u_name, u_inventorykey, u_diffkey, u_prefmode)
    VALUES
    ("Jeff Hanks", 1, 2, "Hiking"),
    ("Bill Smith", 2, 1, "Hiking"),
    ("Bob Mann", 3, 5, "Backpacking")
;

INSERT INTO Equipment(e_name, e_eqkey, e_modekey, e_diffkey, e_information)
    VALUES
    ("Backpack", 1, 3, 4, "Information"),
    ("Beginner Boots", 2, 1, 1, "Information"),
    ("Large Backpack", 3, 3, 5, "Information"),
    ("Trail Bike", 4, 2, 2, "Information"),
    ("Hiking Stick", 5, 1, 1, "Information"),
    ("Tent", 6, 3, 4, "Information")
;

INSERT INTO UserInventory(ui_inventorykey, ui_eqkey, ui_qty, ui_information)
    VALUES
    (1, 2, 1, "Information"),
    (1, 5, 1, "Information"),
    (2, 2, 2, "Information"),
    (2, 5, 3, "Information"),
    (3, 6, 2, "Information"),
    (3, 3, 1, "Information")
;

INSERT INTO User ()