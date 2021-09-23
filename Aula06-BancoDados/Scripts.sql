CREATE TABLE tb_produto (
    cd_produto  NUMBER PRIMARY KEY,
    nm_produto  VARCHAR(80) NOT NULL,
    vl_produto  FLOAT(7),
    ds_produto  VARCHAR(255),
    qt_produto  INTEGER
);