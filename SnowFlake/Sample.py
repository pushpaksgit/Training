import snowflake.connector
i=input()
ctx=snowflake.connector.connect(
    user='pushpakgill',
    password='P**************P',
    account='vagfesr-dw73805'
)
cs=ctx.cursor()
try:
    print("Details are:")
    rs = cs.execute(f"Select * from example.public.table1 where USN='{i}';")
    for row in rs.fetchone():
        print(row)
    cs.execute("create database example;")
    cs.execute("use database example;")
    cs.execute("use schema public;")
    cs.execute("create table table1(USN varchar(20), NAME varchar(20));")
    cs.execute("insert into table1 values('4nm20is','SecondPerson');")
finally:
    cs.close()
ctx.close()
