package com.ck.pay.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAsiaUser is a Querydsl query type for AsiaUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAsiaUser extends EntityPathBase<AsiaUser> {

    private static final long serialVersionUID = -610446143L;

    public static final QAsiaUser asiaUser = new QAsiaUser("asiaUser");

    public final StringPath account = createString("account");

    public final StringPath accountName = createString("accountName");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> lastUpdateTime = createDateTime("lastUpdateTime", java.util.Date.class);

    public final StringPath mobilePhone = createString("mobilePhone");

    public QAsiaUser(String variable) {
        super(AsiaUser.class, forVariable(variable));
    }

    public QAsiaUser(Path<? extends AsiaUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAsiaUser(PathMetadata metadata) {
        super(AsiaUser.class, metadata);
    }

}

