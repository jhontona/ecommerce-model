
    create table Customer (
        id bigint not null,
        email varchar(255) not null,
        name varchar(255) not null,
        primary key (id)
    );

    create table Invoice (
        id bigint not null,
        number varchar(255) not null,
        customer_id bigint,
        primary key (id)
    );

    create table Product (
        DTYPE varchar(31) not null,
        id bigint not null,
        name varchar(255) not null,
        invoice_id bigint,
        primary key (id)
    );

    create table ShoppingCart (
        id bigint not null,
        date varchar(255) not null,
        customer_id bigint,
        product_id bigint,
        primary key (id)
    );

    create table Stock (
        id bigint not null,
        address varchar(255) not null,
        name varchar(255) not null,
        product_id bigint,
        primary key (id)
    );

    alter table Invoice 
        add constraint FKD80EDB0DBE5C611A 
        foreign key (customer_id) 
        references Customer;

    alter table Product 
        add constraint FK50C664CF4A039E7A 
        foreign key (invoice_id) 
        references Invoice;

    alter table ShoppingCart 
        add constraint FKABBC40C8B9432F3A 
        foreign key (product_id) 
        references Product 
        on delete cascade;

    alter table ShoppingCart 
        add constraint FKABBC40C8BE5C611A 
        foreign key (customer_id) 
        references Customer;

    alter table Stock 
        add constraint FK4C806F6B9432F3A 
        foreign key (product_id) 
        references Product;
