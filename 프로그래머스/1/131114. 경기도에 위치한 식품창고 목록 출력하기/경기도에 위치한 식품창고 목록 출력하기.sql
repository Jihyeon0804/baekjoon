select WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IFNULL(FREEZER_YN, 'N')
from FOOD_WAREHOUSE
where ADDRESS like '%경기도%'
order by WAREHOUSE_ID;