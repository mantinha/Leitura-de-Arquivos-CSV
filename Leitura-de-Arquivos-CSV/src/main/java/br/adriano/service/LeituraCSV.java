package br.adriano.service;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import br.adriano.pojo.Pessoa;

/**
 * A classe LeituraCSV faz a leitura, guarda e recupera dados de um arquivo .CSV
 * O nomeDoArquivo pode ser modificado conforme necessidade
 * A List<POJO> pode ser modificada conforme necessidade
 * 
 * @author adriano
 *
 */
public class LeituraCSV {
	
	private final String nomeDoArquivo = "teste.csv";
	private Reader reader;
	private CsvToBean<Pessoa> csvToBean;
	private List<Pessoa> pessoas;
	
	public LeituraCSV() {
		
		try {
			reader = Files.newBufferedReader(Paths.get("src"
					+File.separator
					+"main"
					+File.separator
					+"resources"
					+File.separator
					+ nomeDoArquivo));
			
		} catch (IOException exc) {
			System.err.println("ERRO! arquivo nao encontrado. " + exc.getMessage());
			exc.printStackTrace();
		}
		
	}
	
	public void lerDados() {
		if(reader != null)
			csvToBean = new CsvToBeanBuilder(reader).withType(Pessoa.class).build();
	}
	
	public void guardarDados() {
		if(csvToBean != null)
			pessoas = csvToBean.parse();
	}
	
	public void print() {
		if(pessoas != null) {
			for (Pessoa pessoa : pessoas)
	            System.out.println(pessoa);
		}
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
}
