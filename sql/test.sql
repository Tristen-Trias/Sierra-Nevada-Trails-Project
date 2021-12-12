SELECT t_name
    FROM Trail
    INNER JOIN Difficulty on t_diffkey = d_diffkey

    WHERE(
        d_name = "Medium"
    );

SELECT "----------";

--Delete extremely short trails
DELETE FROM Trail
    WHERE t_length < 1;

SELECT "----------";

--Remove Duplicates
DELETE FROM Trail
    WHERE t_key NOT IN (
      SELECT MIN(t_key) 
        FROM Trail
        GROUP BY t_name
    );

SELECT "----------";

--Print all trails after deletes
--SELECT t_name
--    FROM Trail;

SELECT "----------";

SELECT l_name, count(*)
    FROM Location
    INNER JOIN Trail ON l_name = t_location
    GROUP BY l_name;

SELECT "----------";

--Set the difficulty to Easy where the length is between 5 and 10 miles
UPDATE Trail
    SET t_diffkey = 2
    WHERE(
        t_length >= 5 AND
        t_length <= 10
    );

SELECT "----------";

--Count the number of trails in each difficulty
SELECT d_name, count(*)
    FROM Difficulty
    INNER JOIN Trail ON d_diffkey = t_diffkey
    GROUP BY d_name;

SELECT "----------";

--Count the number of trails within each location
SELECT m_name, count(*)
    FROM Mode
    INNER JOIN Trail ON m_modekey = t_modekey
    GROUP BY m_name;

SELECT "----------";

--Select trail where longer than 10 miles
SELECT t_name, t_length
    FROM Trail
    WHERE t_length > 10;

SELECT "----------";

--Select trail where longer than 20 miles and is for backpacking
SELECT t_name
    FROM Trail
    INNER JOIN Mode ON t_modekey = m_modekey
    WHERE (
        t_length > 20 AND
        m_name = "Backpacking"
    );

SELECT "----------";

--Select trails in Yosemite National Park that are not for hiking
SELECT t_name
    FROM Trail
    INNER JOIN Location ON t_locationkey = l_locationkey
    INNER JOIN Mode ON t_modekey = m_modekey
    WHERE (
        l_name = "Yosemite National Park" AND
        m_name != "Hiking"
    );

SELECT "----------";
--Select trails that are very easy in order from least to greatest length
.headers ON
SELECT t_name AS "Trail Name", t_length AS "Length in Miles"
    FROM Trail
    INNER JOIN Difficulty ON t_diffkey = d_diffkey
    WHERE(
        d_name = "Very Easy"
    )
    ORDER BY t_length;

.headers OFF

SELECT "----------";
--Select trails that are at or above medium difficulty
SELECT t_name, t_location, d_name
    FROM Trail
    INNER JOIN Difficulty ON t_diffkey = d_diffkey
    WHERE(
        d_diffkey >= 3
    );

SELECT "----------";

--Select all items in Bob Manns inventory
SELECT u_name, e_name
    FROM User
    INNER JOIN UserInventory ON u_inventorykey = ui_inventorykey
    INNER JOIN Equipment ON ui_eqkey = e_eqkey

    WHERE(
        u_name = "Bob Mann"
    );