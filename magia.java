package magias;

import java.util.Scanner;

public class magia {
	

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int meta=0, nasod=0, roll=0, multi=0, rnasod=1 ;
		char tipo='a';
		String dado;
		double danoTotal=0;
		
		System.out.print("Nasods: ");
		nasod = in.nextInt();
		
		rnasod=nasod/5;
		
		System.out.println("Rolagem (r)| Multiplicador (m)");
		tipo = in.next().charAt(0);
		
		
		switch (tipo) {
		
		case 'r':
			
			System.out.print("Rolagens: ");
			roll = in.nextInt();
			
			System.out.print("Dado: ");
			dado = in.next();
			
			System.out.print("Tipo: ");
			tipo = in.next().charAt(0);
			
			System.out.print("0 - Nenhum \n1 - Max Twin \n2 - Max Triplet \n3 - Twin \n4 - Triplet \n");
			meta = in.nextInt();
			
			if (rnasod>=1) {
				roll=roll*nasod;
			}
			
			if (meta==0) {
				
				danoTotal = rolagem (tipo, nasod) + (nasod*10);
				
				if (rnasod>=1) {
					
					danoTotal = (rolagem (tipo, nasod) + (nasod*10))*rnasod;
				}
				
			}
			
			else if (meta==1) {	
				
			
				danoTotal = 4*(rolagem (tipo, nasod)+(nasod*10));
				
				if (rnasod>=1) {
					
					rnasod=4*rnasod;
					
					danoTotal = (rolagem (tipo, nasod) + (nasod*10))*rnasod;
				}
			}
			
			else if (meta==2) {
				
				danoTotal = 6*(rolagem (tipo, nasod)+(nasod*10));
				
					if (rnasod>=1) {
					
					rnasod=6*rnasod;
					
					danoTotal = (rolagem (tipo, nasod) + (nasod*10))*rnasod;
				}
			}
			
			else if (meta==3) {
				
				danoTotal = 2*(rolagem (tipo, nasod)+(nasod*10));
				
				if (rnasod>=1) {
				
				rnasod=2*rnasod;
				
				danoTotal = (rolagem (tipo, nasod) + (nasod*10))*rnasod;
			}
				
				
			}
			
			else if (meta==4) {
				
				danoTotal = 3*(rolagem (tipo, nasod)+(nasod*10));
				
				if (rnasod>=1) {
				
				rnasod=3*rnasod;
				
				danoTotal = (rolagem (tipo, nasod) + (nasod*10))*rnasod;
			}
	}
			System.out.print("Dano Total: " + roll + dado + "+" + danoTotal );
			
			
			
			break;	
		
		case 'm':
			
			System.out.print("Vezes: ");
			multi = in.nextInt();
			
			System.out.print("Tipo: ");
			tipo = in.next().charAt(0);
			
			System.out.print("0 - Nenhum \n1 - Max Twin \n2 - Max Triplet \n3 - Twin \n4 - Triplet \n");
			meta = in.nextInt();
			
			
			if (meta==0) {
				
				danoTotal = multi (multi, nasod, tipo) + (nasod*10);
				
				if (rnasod>=1) {
					
					danoTotal = (multi(multi, nasod, tipo) + (nasod*10))*rnasod;
				}
				
			}
			
			else if (meta==1) {	
				
			
				danoTotal = 4*(multi (multi, nasod, tipo)+(nasod*10));
				
				if (rnasod>=1) {
					
					rnasod=4*rnasod;
					
					danoTotal = (multi (multi, nasod, tipo) + (nasod*10))*rnasod;
				}
			}
			
			else if (meta==2) {
				
				danoTotal = 6*(multi (multi, nasod, tipo)+(nasod*10));
				
					if (rnasod>=1) {
					
					rnasod=6*rnasod;
					
					danoTotal = (multi (multi, nasod, tipo) + (nasod*10))*rnasod;
				}
			}
			
			else if (meta==3) {
				
				danoTotal = 2*(multi (multi, nasod, tipo)+(nasod*10));
				
				if (rnasod>=1) {
				
				rnasod=2*rnasod;
				
				danoTotal = (multi (multi, nasod, tipo) + (nasod*10))*rnasod;
			}
				
				
			}
			
			else if (meta==4) {
				
				danoTotal = 3*(multi (multi, nasod, tipo)+(nasod*10));
				
				if (rnasod>=1) {
				
				rnasod=3*rnasod;
				
				danoTotal = (multi (multi, nasod, tipo) + (nasod*10))*rnasod;
			}
	}
			System.out.print("Dano Total: " + danoTotal );
			
			
			
		
			break;	
	
		}//switch
			
			
	}
	
		
	
	public static double rolagem(char tipo, int nasod) {
		
		int mod=60, duni=20, dvvp=10 , delm=10, rnasod=nasod/5;
		double dvazio=1.26, dano=0;
		
		switch (tipo) {
		
		case 'v':
			
			if (rnasod<=0) {
				
				dano = (mod+duni+dvvp)*dvazio;
			}
			
			else if (rnasod>=1) {
				
				dano = ((mod+duni+dvvp)*dvazio)*rnasod;	
			}
			
			break;
		
		case 't': case 'p':
			
			if (rnasod<=0) {
				
				dano= mod+duni+dvvp;
			}
			
			else if (rnasod>=1) {
				dano= (mod+duni+dvvp)*rnasod;
			}
		
			break;
		
		case 'e':
			
			if (rnasod<=0) {
				
				dano= mod+duni+delm;
			}
			
			else if (rnasod>=1) {
				
				dano = (mod+duni+delm)*rnasod;
			}
		
		
		}//switch
		
		return dano;
		
		
	}
		
		
	public static double multi(int mult, int nasod, char tipo) {
		int mod=60*mult, duni=20, dvvp=10 , delm=10, rnasod=nasod/5;
		double dvazio=1.26, dano=0;
		
		switch (tipo) {
		
		case 'v':
			
			if (rnasod==0) {
				dano = (mod+duni+dvvp)*dvazio;
			}
			
			else if (rnasod>=1) {
				dano = ((mod+duni+dvvp)*dvazio)*rnasod;
			}
			
		break;
		
		case 't': case 'p':
			
			if (rnasod==0) {
				dano = mod+duni+dvvp;
			}
			
			else if (rnasod>=1) {
				dano = (mod+duni+dvvp)*rnasod;
			}
			
		break;
		
		case 'e':
			if (rnasod==0) {
				dano = mod+duni+delm;
			}
			
			else if (rnasod>=1) {
				dano = (mod+duni+delm)*rnasod;
			}
			
		break;	
		
		}
	 
		return dano;
		
	}
	
}
