/*
 * Copyright (C) 2015 www.amsoft.cn
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.entboost.task;



// TODO: Auto-generated Javadoc
/**
 * 描述：数据执行的接口.
 * @author amsoft.cn
 * @date 2011-12-10
 * @version v1.0
 */
public abstract class AbTaskObjectListener extends AbTaskListener{
	
	/**
     * @param <T>
	 * @return 返回的结果对象
     */
    public abstract <T> T getObject();
    
    /**
     * 描述：执行开始后调用.
     * @param <T>
     * @param entity 返回的对象   
     * */
    public abstract <T> void update(T obj); 
    
	
}
