ALTER TABLE orders DROP COLUMN las_modified_date;

ALTER TABLE orders ADD last_modified_date timestamp not null;