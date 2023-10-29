-- 코드를 입력하세요
SELECT p.PRODUCT_ID, p.PRODUCT_NAME, sum(p.price * o.amount) TOTAL_SALES
from FOOD_PRODUCT p
join FOOD_ORDER o on p.PRODUCT_ID = o.PRODUCT_ID
where o.PRODUCE_DATE >= '2022-05-01' and o.PRODUCE_DATE < '2022-06-01'
group by p.PRODUCT_ID
order by TOTAL_SALES desc, p.product_id
