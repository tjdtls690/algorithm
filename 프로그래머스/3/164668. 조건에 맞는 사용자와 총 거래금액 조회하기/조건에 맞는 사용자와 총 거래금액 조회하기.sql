# 1. 완료된 중고 거래(where)
# 2. 거래 총 금액 70만원 이상 (where)
# 3. 총 거래 금액으로 정렬 (order by)

-- 코드를 입력하세요
select u.user_id, u.nickname, sum(b.price) as total_sales
from USED_GOODS_BOARD as b 
join USED_GOODS_USER as u on b.WRITER_ID = u.USER_ID
where b.STATUS = 'DONE'
group by u.user_id
having total_sales >= 700000
order by total_sales;