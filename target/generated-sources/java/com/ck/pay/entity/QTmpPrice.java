package com.ck.pay.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTmpPrice is a Querydsl query type for TmpPrice
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTmpPrice extends EntityPathBase<TmpPrice> {

    private static final long serialVersionUID = 1593682814L;

    public static final QTmpPrice tmpPrice = new QTmpPrice("tmpPrice");

    public final StringPath price = createString("price");

    public QTmpPrice(String variable) {
        super(TmpPrice.class, forVariable(variable));
    }

    public QTmpPrice(Path<? extends TmpPrice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTmpPrice(PathMetadata metadata) {
        super(TmpPrice.class, metadata);
    }

}

