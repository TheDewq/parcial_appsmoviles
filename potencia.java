class potencia{
    
    public int potenciar(int x, int y){
        if(y <= 1){
            System.out.println("el valor "+y+" no se puede potenciar");
        }else{
            int resultado = multiplicar(x, x);

            for(int i = 2; i < y; i++){
                resultado = multiplicar(resultado, x);
            }
            return resultado;
        }

        return 0;
        
    }

    private int multiplicar(int x, int y){
        int resultado = 0;
        for(int i = 0; i < y ; i++){
            resultado= sumar(resultado, x);
        }
        return resultado;
    }

    private int sumar(int x, int y){
        
        return x + y;
    }
}