package com.xiangji.demo.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

/**
 * MP注入处理器
 * @author Xiangji
 * @date 2021/4/25
 */
@Slf4j
public class CreateAndUpdateMetaObjectHandler implements MetaObjectHandler {

	@Override
	public void insertFill(MetaObject metaObject) {
		log.info("insert开始属性填充");
		//根据属性名字设置要填充的值
		if (metaObject.hasGetter("gmtCreate")) {
			if (metaObject.getValue("gmtCreate") == null) {
				this.setFieldValByName("gmtCreate", LocalDateTime.now(), metaObject);
			}
		}
	}

	@Override
	public void updateFill(MetaObject metaObject) {
		log.info("update开始属性填充");
		if (metaObject.hasGetter("gmtModified")) {
			if (metaObject.getValue("gmtModified") == null) {
				this.setFieldValByName("gmtModified", LocalDateTime.now(), metaObject);
			}
		}
	}

}
