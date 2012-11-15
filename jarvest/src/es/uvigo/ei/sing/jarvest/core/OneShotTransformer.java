/*

Copyright 2012 Daniel Gonzalez Peña


This file is part of the jARVEST Project. 

jARVEST Project is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

jARVEST Project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser Public License for more details.

You should have received a copy of the GNU Lesser Public License
along with jARVEST Project.  If not, see <http://www.gnu.org/licenses/>.
*/
package es.uvigo.ei.sing.jarvest.core;

public class OneShotTransformer extends AbstractTransformer{

	/**
	 * Serial Version UID 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String[] _apply(String[] source) {
		return source;
	}

	
	
	// NEW MODEL
	@Override
	protected void _pushString(String str){
		this.getOutputHandler().pushOutput(str);
	}
	@Override
	protected void _closeOneInput() {
		this.getOutputHandler().outputFinished();
		this.getOutputHandler().allFinished();
		
	}
	@Override
	protected void _closeAllInputs() {
		//none
	}

}
