public class CorpoHumano {
    
    private float massa;      
    private float volume;     
    private float densidade;  
    private float altura;     

    public CorpoHumano(float massa, float volume, float densidade, float altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    
    public float getMassa() {
        return massa;
    }

    public float getVolume() {
        return volume;
    }

    public float getDensidade() {
        return densidade;
    }
    

    //Desafio Extra
    public float getAltura() {
        return altura;
    }

    public void setMassa(float massa) {
        if (massa > 0) {
            this.massa = massa;
        } else {
            System.out.println("Erro: A massa deve ser um valor positivo.");
        }
    }

    public void setVolume(float volume) {
        if (volume > 0) {
            this.volume = volume;
            calcularDensidade();
        } else {
            System.out.println("Erro: O volume deve ser um valor positivo.");
        }
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: A altura deve ser um valor positivo.");
        }
    }
    
    private void calcularDensidade() {
        if (volume > 0) {
            this.densidade = massa / volume;
        } else {
            this.densidade = 0; 
        }
    }

    public double calcularIMC() {
        if (altura > 0) {
            
            return (double) massa / ((double) altura * (double) altura);
        }
        return 0.0;
    }
}