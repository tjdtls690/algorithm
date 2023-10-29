-- 코드를 입력하세요
SELECT mf.category, mf.price max_price, mf.product_name
from food_product mf
join
    (select category, max(price) mp
    from food_product
    where category = '과자' or category = '국' or category = '김치' or category = '식용유'
    group by category) sf on mf.category = sf.category and mf.price = sf.mp
order by max_price desc