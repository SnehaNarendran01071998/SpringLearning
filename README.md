# SpringLearning
git clone the repo
change the application.properties file. 
connect to postgres=> create a table CREATE TABLE customer(id SERIAL,first_name varchar(255),last_name varchar(255));
The description of the table should be as following
\d customer
                       Table "public.customer"
   Column   |          Type          | Collation | Nullable | Default
------------+------------------------+-----------+----------+---------
 id         | bigint                 |           | not null |
 first_name | character varying(255) |           |          |
 last_name  | character varying(255) |           |          |
Indexes:
    "customer_pkey" PRIMARY KEY, btree (id)
    
Run the application using 
.\gradlew clean bootRun
