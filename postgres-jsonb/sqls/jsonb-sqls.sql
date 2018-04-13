create schema users;

create table users.details(
	"id" numeric(25) not null,
	"dtls" jsonb
);

insert into users.details values(10001, '{"name":"Adam Doe", "age": "29", "city" : "Schaumburg", "zipcode":"60173"}');
insert into users.details values(10002, '{"name":"Beth Doe", "age": "23", "city" : "Rolling Meadows", "zipcode":"60008"}');
insert into users.details values(10003, '{"name":"Christine Doe", "age": "35", "city" : "Des Plaines", "zipcode":"60016"}');
insert into users.details values(10004, '{"name":"David Doe", "age": "21", "city" : "Des Plaines", "zipcode":"60016"}');
insert into users.details values(10005, '{"name":"Ethan Doe", "age": "77", "city" : "Rolling Meadows", "zipcode":"60008"}');
insert into users.details values(10006, '{"name":"Felipe Doe", "age": "45", "city" : "Hoffman Estates", "zipcode":"60169"}');
insert into users.details values(10007, '{"name":"Gerome Doe", "age": "29", "city" : "Hoffman Estates", "zipcode":"60179"}');
insert into users.details values(10008, '{"name":"Hanna Doe", "age": "33", "city" : "Schaumburg", "zipcode":"60195"}');
insert into users.details values(10009, '{"name":"Irina Doe", "age": "12", "city" : "Niles", "zipcode":"60714"}');
insert into users.details values(10010, '{"name":"John Doe", "age": "15", "city" : "Hoffman Estates", "zipcode":"60169"}');
insert into users.details values(10011, '{"name":"Kyle Doe", "age": "37", "city" : "Schaumburg", "zipcode":"60195", "country" : {"countryCode":"US","countryShortName":"USA", "countryFullName":"United States of America"}}');
insert into users.details values(10012, '{"name":"Lily Doe", "age": "15", "city" : "Des Plaines", "zipcode":"60016", "socialMedia" : ["Facebook", "Twitter","Snapchat"]}');
insert into users.details values(10013, '{"name":"Mathew Doe", "age": "29", "city" : "Des Plaines", "zipcode":"60016", "socialMedia" : ["Twitter","Snapchat"]}');
insert into users.details values(10014, '{"name":"Nolan Doe", "age": "23", "city" : "Rolling Meadows", "zipcode":"60008", "socialMedia" : ["Facebook"]}');

--query using containment operator - @>
select * from users.details where dtls @> '{"city":"Hoffman Estates"}';

select * from users.details where dtls @> '{"city" : "Hoffman Estates", "zipcode":"60169"}'

--select specific columns
select dtls->>'name' from users.details where dtls @> '{"city" : "Hoffman Estates", "zipcode":"60169"}'

select dtls @>  from users.details where dtls @> '{"city" : "Hoffman Estates", "zipcode":"60169"}'

--select using ->> operators
select * from users.details where dtls ->>'city'='Hoffman Estates' and dtls->>'zipcode'='60179'

select * from users.details where dtls @> '{"country" : {"countryCode" : "US"}}';

select * from users.details where dtls -> 'country' ->> 'countryCode' = 'US';

--select when specific column is not null
select * from users.details where dtls->'country'->>'countryCode' is not null;

--select when specific column is null
select * from users.details where dtls->'country'->>'countryCode' is null;

--select from mulitple values using in clause
select * from users.details where dtls->>'zipcode' in ('60169', '60179', '60173','60195');

--select from array
select * from users.details where dtls @> '{"socialMedia" : ["Facebook"]}';
select * from users.details where dtls @> '{"socialMedia" : ["Snapchat"]}';
select * from users.details where dtls @> '{"socialMedia" : ["Snapchat", "Facebook"]}';

update users.details set id=10013 where dtls->>'name'='Mathew Doe'

--append values to JSONB column
update users.details set dtls = dtls || '{"country" : {"countryCode" : "US"}}' where id=10010

--append values to JSONB column (overwrites previous append)
update users.details set dtls = dtls || '{"country" : {"countryShortName" : "USA"}}' where id=10010
update  users.details set dtls = dtls || '{"country" : {"countryShortName" : "USA"}}' where id=10009


--removing a key from an object
update users.details set dtls = dtls - 'country' where id=10009;