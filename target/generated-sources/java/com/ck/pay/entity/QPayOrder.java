package com.ck.pay.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayOrder is a Querydsl query type for PayOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPayOrder extends EntityPathBase<PayOrder> {

    private static final long serialVersionUID = 1409000594L;

    public static final QPayOrder payOrder = new QPayOrder("payOrder");

    public final NumberPath<Long> closeDate = createNumber("closeDate", Long.class);

    public final NumberPath<Long> createDate = createNumber("createDate", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> isAuto = createNumber("isAuto", Integer.class);

    public final StringPath notifyUrl = createString("notifyUrl");

    public final StringPath orderId = createString("orderId");

    public final StringPath param = createString("param");

    public final NumberPath<Long> payDate = createNumber("payDate", Long.class);

    public final StringPath payId = createString("payId");

    public final StringPath payUrl = createString("payUrl");

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public final NumberPath<Double> reallyPrice = createNumber("reallyPrice", Double.class);

    public final StringPath returnUrl = createString("returnUrl");

    public final NumberPath<Integer> state = createNumber("state", Integer.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public QPayOrder(String variable) {
        super(PayOrder.class, forVariable(variable));
    }

    public QPayOrder(Path<? extends PayOrder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayOrder(PathMetadata metadata) {
        super(PayOrder.class, metadata);
    }

}

