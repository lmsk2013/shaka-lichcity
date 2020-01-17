package com.shaka.lichcity.manager;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 袁振
 * @date 2020/1/15 19:24
 */
public interface CacheManager {

	/***
	 * description:设置失效时间
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param time 时间 秒
	 * @return boolean
	 */
	boolean expire(String key, long time);

	/***
	 * description:根据key 获取过期时间
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @return long
	 */
	long getExpire(String key);

	/***
	 * description:判断是否有值
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @return boolean
	 */
	boolean hasKey(String key);

	/***
	 * description:删除
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @return void
	 */
	void del(String... key);

	/****
	 * description:获取缓存
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @return java.lang.Object
	 */
	public Object get(String key);

	/***
	 * description:设置缓存
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param value 值
	 * @return boolean
	 */
	boolean set(String key, Object value);

	/***
	 * description:设置缓存
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param value 值
	 * @param time 超时时间
	 * @return boolean
	 */
	boolean set(String key, Object value, long time);

	/***
	 * description:递增
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param delta 加数
	 * @return long
	 */
	long incr(String key, long delta);

	/***
	 * description:递减
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param delta 减数
	 * @return long
	 */
	long decr(String key, long delta);

	/***
	 * description:hashGet
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param item 项
	 * @return java.lang.Object
	 */
	Object hget(String key, String item);

	/***
	 * description:获取hashKey对应所有的值
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @return java.util.Map<java.lang.Object,java.lang.Object>
	 */
	Map<Object,Object> hmget(String key);

	/***
	 * description:HashSet
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param map 对应多个键值
	 * @return boolean
	 */
	boolean hmset(String key, Map<String, Object> map);

	/***
	 * description:HashSet 并设置时间
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param map 对应多个键值
	 * @param time 时间(秒)
	 * @return boolean
	 */
	boolean hmset(String key, Map<String, Object> map, long time);

	/***
	 * description:向一张hash表中放入数据,如果不存在将创建
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param item 项
	 * @param value 值
	 * @return boolean
	 */
	boolean hset(String key, String item, Object value);

	/***
	 * description:向一张hash表中放入数据,如果不存在将创建
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param item 项
	 * @param value 值
	 * @param time 时间(秒) 注意:如果已存在的hash表有时间,这里将会替换原有的时间
	 * @return boolean
	 */
	boolean hset(String key, String item, Object value, long time);

	/***
	 * description:删除hash表中的值
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键 不能为null
	 * @param item 项 可以使多个 不能为null
	 * @return void
	 */
	void hdel(String key, Object... item);

	/***
	 * description:判断hash表中是否有该项的值
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键 不能为null
	 * @param item  项 不能为null
	 * @return boolean
	 */
	boolean hHasKey(String key, String item);

	/***
	 * description:hash递增 如果不存在,就会创建一个 并把新增后的值返回
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param item 项
	 * @param by 要增加几(大于0)
	 * @return double
	 */
	double hincr(String key, String item, double by);

	/***
	 * description:hash递减
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param item 项
	 * @param by 要减少记(小于0)
	 * @return double
	 */
	double hdecr(String key, String item, double by);

	/***
	 * description:根据key获取Set中的所有值
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @return java.util.Set<java.lang.Object>
	 */
	Set<Object> sGet(String key);

	/***
	 * description:根据value从一个set中查询,是否存在
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param value 值
	 * @return boolean
	 */
	boolean sHasKey(String key, Object value);

	/***
	 * description:将数据放入set缓存
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param values 值 可以是多个
	 * @return long
	 */
	long sSet(String key, Object... values);

	/***
	 * description:将set数据放入缓存
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param time 时间(秒)
	 * @param values 值 可以是多个
	 * @return long
	 */
	long sSetAndTime(String key, long time, Object... values);

	/***
	 * description:获取set缓存的长度
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @return long
	 */
	long sGetSetSize(String key);

	/***
	 * description:移除值为value的
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param values 值 可以是多个
	 * @return long
	 */
	long setRemove(String key, Object... values);

	/***
	 * description:获取list缓存的内容
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param start 开始
	 * @param end 结束 0 到 -1代表所有值
	 * @return List<Object>
	 */
	List<Object> lGet(String key, long start, long end);

	/***
	 * description:获取list缓存的长度
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @return long
	 */
	long lGetListSize(String key);

	/***
	 * description:通过索引 获取list中的值
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param index 索引 index>=0时， 0 表头，1 第二个元素，依次类推；index<0时，-1，表尾，-2倒数第二个元素，依次类推
	 * @return java.lang.Object
	 */
	Object lGetIndex(String key, long index);

	/***
	 * description:将list放入缓存
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param value 值
	 * @return boolean
	 */
	boolean lSet(String key, Object value);

	/***
	 * description:将list放入缓存
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param value 值
	 * @param time 时间(秒)
	 * @return boolean
	 */
	boolean lSet(String key, Object value, long time);

	/***
	 * description:将list放入缓存
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param value 值
	 * @return boolean
	 */
	boolean lSet(String key, List<Object> value);

	/***
	 * description:将list放入缓存
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param value 值
	 * @param time 时间(秒)
	 * @return boolean
	 */
	boolean lSet(String key, List<Object> value, long time);

	/***
	 * description:根据索引修改list中的某条数据
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param index 索引
	 * @param value 值
	 * @return boolean
	 */
	boolean lUpdateIndex(String key, long index, Object value);

	/***
	 * description:移除N个值为value
	 * @author yuanzhen
	 * @date 2020/1/15
	 * @param key 键
	 * @param count 移除多少个
	 * @param value 值
	 * @return long
	 */
	long lRemove(String key, long count, Object value);
}
