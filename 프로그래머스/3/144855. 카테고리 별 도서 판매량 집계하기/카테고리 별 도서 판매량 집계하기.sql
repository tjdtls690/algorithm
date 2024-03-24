select b.CATEGORY, sum(bs.SALES) TOTAL_SALES
from BOOK b
join BOOK_SALES bs on b.BOOK_ID = bs.BOOK_ID
where bs.SALES_DATE >= '2022-01-01' and bs.SALES_DATE < '2022-02-01'
group by CATEGORY
order by CATEGORY;