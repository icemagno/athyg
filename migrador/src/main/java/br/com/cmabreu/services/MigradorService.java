package br.com.cmabreu.services;

import java.io.File;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cmabreu.model.Star;
import br.com.cmabreu.repository.StarRepository;

@Service
public class MigradorService {
	
	@Autowired private StarRepository starRepository;
	
	public void init() {
		try {
			migraBiogas();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Long asLong( String s ) {
		return Long.valueOf(s);
	}
	
	private Double asDouble( String s ) {
		if( s.length() == 0 ) s = "0.0";
		return Double.valueOf( s );
	}
	
	private void migraBiogas() throws Exception {
		
		try {
			Scanner scanner = new Scanner( new File("/athyg/athyg_v20.csv") );
			
			// Descarta o cabeçalho
			scanner.nextLine();
			
			while (scanner.hasNextLine()) {
				String starData = scanner.nextLine();
				String[] dt = starData.split(",", -1);
				Star st = new Star();
				st.setId( asLong( dt[0] ) );
				st.setTyc( dt[1] );
				st.setGaia( dt[2] );
				st.setHyg( dt[3] );
				st.setHip( dt[4] );
				st.setHd( dt[5] );
				st.setHr( dt[6] );
				st.setGl( dt[7] );
				st.setBayer( dt[8] );
				st.setFlam( dt[9] );
				st.setCon( dt[10] );
				st.setProper( dt[11] );
				st.setRa( asDouble( dt[12] ) );
				st.setDecl( asDouble( dt[13] ) );
				st.setPos_src( dt[14 ] );
				st.setDist( asDouble( dt[15] ) );
				st.setX0(  asDouble( dt[16] ) );
				st.setY0( asDouble( dt[17] ) );
				st.setZ0( asDouble( dt[18] ) );
				st.setDist_src( dt[19] );
				st.setMag( asDouble( dt[20] ) );
				st.setAbsmag( asDouble( dt[21] ) );
				st.setMag_src( dt[22] );
				st.setRv( asDouble( dt[23] ) );
				st.setRv_src( dt[24] );
				st.setPm_dec( asDouble( dt[26] ) );
				st.setPm_src( dt[27] );
				st.setVx( asDouble( dt[28] ) );
				st.setVy( asDouble( dt[29] ) );
				st.setVz( asDouble( dt[30] ) );
				
				starRepository.save( st );
				
			}
			
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		
			
	}
	

	
	
}
