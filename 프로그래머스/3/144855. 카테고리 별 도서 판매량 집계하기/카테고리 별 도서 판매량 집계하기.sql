# 1. 도서 아이디로 그룹화 한다.
    # sales는 합친다.
    # 판매일을 2022년 1월로 지정한다.
    # 카테고리, 합친 판매량을 조회한다.
# 2. 카테고리별로 그룹화 한다.
    # sales는 합친다.
    # 카테고리로 정렬한다.
    
select CATEGORY, sum(TOTAL_SALES) as TOTAL_SALES
from (SELECT b.category as CATEGORY, sum(bs.sales) as TOTAL_SALES
        from BOOK as b
        join BOOK_SALES as bs on b.BOOK_ID = bs.BOOK_ID
        where bs.SALES_DATE >= '2022-01-01' and bs.SALES_DATE < '2022-02-01'
        group by b.BOOK_ID) as sub
group by CATEGORY
order by CATEGORY;