-- 코드를 입력하세요
SELECT r.FOOD_TYPE, r.rest_id, r.rest_name, r.favorites
from REST_INFO as r
join
    (select food_type, max(FAVORITES) as f
    from rest_info
    group by food_type) as fm on fm.food_type = r.food_type and r.favorites = fm.f
order by r.food_type desc