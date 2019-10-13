package com.ck.pay.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayQrcode is a Querydsl query type for PayQrcode
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPayQrcode extends EntityPathBase<PayQrcode> {

    private static final long serialVersionUID = 786583242L;

    public static final QPayQrcode payQrcode = new QPayQrcode("payQrcode");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath payUrl = createString("payUrl");

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public QPayQrcode(String variable) {
        super(PayQrcode.class, forVariable(variable));
    }

    public QPayQrcode(Path<? extends PayQrcode> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayQrcode(PathMetadata metadata) {
        super(PayQrcode.class, metadata);
    }

}

