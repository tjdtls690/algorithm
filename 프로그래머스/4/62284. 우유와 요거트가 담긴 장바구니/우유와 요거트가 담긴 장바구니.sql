-- 코드를 입력하세요
with scp as
(
    select cart_id
    from cart_products
    group by cart_id, name
    having name = 'Milk' or name = 'Yogurt'
)

select cart_id
from scp
group by cart_id
having count(cart_id) = 2
order by cart_id;