#include <stdio.h>
#include <stdlib.h>
int main()
{
    int hi, hf, mi, mf;
    do{
        printf("Digite a hora inicial: \n");
        scanf("%d", &hi);
    }while( (hi<0) ||(hi>23));
    do{
        printf("Digite o minuto inicial: \n");
        scanf("%d", &mi);
    }while( (mi<0) ||(mi>59));
    do{
        printf("Digite a hora final: \n");
        scanf("%d", &hf);
    }while( (hf<0) ||(hf>23));
    do{
        printf("Digite o minuto final: \n");
        scanf("%d", &mf);
    }while( (mf<0) ||(mf>59));
    if(hi>hf){
        printf("Hora de inicio e término invalidos \n");
        return 0;
    } else{
        if(hi==hf){
            if(mi>mf){
                printf("Hora de início e termino invalidos\n");
                return 0;
            }
        }
    }
    int ti, tf, tempo;
    ti = hi * 60 + mi;
    tf = hf * 60 + mf;
    tempo = tf-ti;
    int horas = tempo / 60;
    int minutos = tempo % 60;
    //Faltou tratar a duracao max 5 e o fechamento a meia noite
    printf("Tempo de duracao: %2dH:%2dM \n", horas, minutos);
    return 0;
}
