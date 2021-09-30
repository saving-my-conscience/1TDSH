CREATE TABLE tb_produto (
    cd_produto  NUMBER PRIMARY KEY,
    nm_produto  VARCHAR(80) NOT NULL,
    vl_produto  FLOAT(7),
    ds_produto  VARCHAR(255),
    qt_produto  INTEGER
);


create sequence sq_tb_produto start with 1 increment by 1;