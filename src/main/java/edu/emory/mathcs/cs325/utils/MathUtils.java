/**
 * Copyright 2014, Emory University
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
package edu.emory.mathcs.cs325.utils;

import java.util.Collection;

/**
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class MathUtils
{
	static public double average(Collection<Double> col)
	{
		return sum(col) / col.size();
	}
	
	static public double sum(Collection<Double> col)
	{
		double sum = 0;
		for (double key : col) sum += key;
		return sum;
	}
	
	/** @return the double value of {@code numerator} / {@code denominator}. */
	static public double divide(int numerator, int denominator)
	{
		return (double)numerator / denominator;
	}
	
	static public void main(String[] args)
	{
		System.out.println(divide(1, 2));
	}
}
