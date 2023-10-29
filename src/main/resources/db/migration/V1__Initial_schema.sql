CREATE TABLE orders(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    book_isbn varchar(255) not null,
    book_name varchar(255) not null,
    book_price float8,
    quantity int not null,
    status varchar(100) not null,
    create_date timestamp not null,
    las_modified_date timestamp not null,
    version integer not null
);