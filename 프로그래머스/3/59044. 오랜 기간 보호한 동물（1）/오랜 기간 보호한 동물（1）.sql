-- 코드를 입력하세요
select name, datetime
from (SELECT i.name, i.datetime
    from ANIMAL_INS as i
    left join ANIMAL_OUTS as o on i.ANIMAL_ID = o.ANIMAL_ID
    where o.ANIMAL_ID is NULL
    order by now() - i.datetime desc
    limit 3) as sub
order by datetime;
