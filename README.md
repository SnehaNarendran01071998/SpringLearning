# SpringLearning
git clone the repo


Change the application.properties file. The changes will be the name of the database, it's username etc.. 


Connect to postgres=> create a table

```CREATE TABLE customer(id SERIAL,first_name varchar(255),last_name varchar(255));```


The description of the table should be as following

```\d customer```


  ```                     Table "public.customer"
   Column   |          Type          | Collation | Nullable | Default
------------+------------------------+-----------+----------+---------
 id         | bigint                 |           | not null |
 first_name | character varying(255) |           |          |
 last_name  | character varying(255) |           |          |
Indexes:
    "customer_pkey" PRIMARY KEY, btree (id)````
    
    
    
Run the application using 
```.\gradlew clean bootRun```
