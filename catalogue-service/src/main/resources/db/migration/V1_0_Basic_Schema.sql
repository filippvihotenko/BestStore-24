CREATE schema if not exists catalogue;

create table catalogue.t_item(
    id  serial not null PRIMARY KEY,
    c_title varchar(50),
    c_details varchar(50)
);

INSERT INTO catalogue.t_item (c_title, c_details)
VALUES
    ('Mechanical Pencil', 'High-quality mechanical pencil with 0.5mm lead'),
    ('Leather Notebook', 'A5 size, 192 pages, ivory-colored paper');
