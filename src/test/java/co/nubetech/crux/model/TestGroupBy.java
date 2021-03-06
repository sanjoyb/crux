/**
 * Copyright 2011 Nube Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package co.nubetech.crux.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestGroupBy {
	
	@Test
	public void testEqualsWithNoValuesNull(){
		GroupBy groupBy = new GroupBy();
		groupBy.setId(1l);
		RowAlias alias = new RowAlias();
		alias.setId(100l);
		groupBy.setRowAlias(alias);
		groupBy.setPosition(1);
		
		GroupBy groupBy1 = new GroupBy();
		groupBy1.setId(1l);
		RowAlias alias1 = new RowAlias();
		alias1.setId(100l);
		groupBy1.setRowAlias(alias1);
		groupBy1.setPosition(1);
		
		assertEquals(groupBy, groupBy1);
	}
	
	@Test
	public void notEquals() {
		GroupBy groupBy = new GroupBy();
		groupBy.setId(1l);
		RowAlias alias = new RowAlias();
		alias.setId(100l);
		groupBy.setRowAlias(alias);
		
		GroupBy groupBy1 = new GroupBy();
		groupBy1.setId(2l);
		RowAlias alias1 = new RowAlias();
		alias1.setId(100l);
		groupBy1.setRowAlias(alias1);
		
		assertFalse(groupBy.equals(groupBy1));
	}
	
	@Test
	public void testHashCodeWithNoValuesNull(){
		GroupBy groupBy = new GroupBy();
		groupBy.setId(1l);
		RowAlias alias = new RowAlias();
		alias.setId(100l);
		groupBy.setRowAlias(alias);
		
		GroupBy groupBy1 = new GroupBy();
		groupBy1.setId(1l);
		RowAlias alias1 = new RowAlias();
		alias1.setId(100l);
		groupBy1.setRowAlias(alias1);
		
		assertEquals(groupBy.hashCode(), groupBy1.hashCode());
	}

}
