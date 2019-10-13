package com.ck.pay.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSetting is a Querydsl query type for Setting
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSetting extends EntityPathBase<Setting> {

    private static final long serialVersionUID = -1891653692L;

    public static final QSetting setting = new QSetting("setting");

    public final StringPath vkey = createString("vkey");

    public final StringPath vvalue = createString("vvalue");

    public QSetting(String variable) {
        super(Setting.class, forVariable(variable));
    }

    public QSetting(Path<? extends Setting> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSetting(PathMetadata metadata) {
        super(Setting.class, metadata);
    }

}

