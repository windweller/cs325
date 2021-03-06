/**
 * Copyright 2015, Emory University
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
package edu.emory.mathcs.cs325.feature;

import java.util.ArrayList;
import java.util.List;

import edu.emory.mathcs.cs325.token.NERToken;

/**
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class SimpleFeatureExtractor extends AbstractFeatureExtractor<NERToken>
{
	@Override
	public List<StringFeature> getStringFeatures(List<NERToken> tokens, int index)
	{
		List<StringFeature> features = new ArrayList<>();

		// current word form
		features.add(new StringFeature("f0", tokens.get(index).getWord()));
		
		// previous label
		if (index-1 >= 0)
			features.add(new StringFeature("f1", tokens.get(index-1).getLabel()));
		
		return features;
	}
}
