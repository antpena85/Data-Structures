class NumericInput extends TextInput{
	
    @Override
	public void add(char a){
        if (a >= '0' && a <= '9')
            super.add(a);
    }
    
}