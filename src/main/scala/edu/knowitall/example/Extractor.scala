//This is an practice example with ollie and nlptools to read lines
//and output the extractions
package edu.knowitall.example

import edu.knowitall.ollie.Ollie
import edu.knowitall.tool.parse.StanfordParser
import java.util.Scanner

object Extractor {
	def main(args: Array[String]){
		val ollie = new Ollie() 
		val parser = new StanfordParser()
		for (line <- io.Source.stdin.getLines) {
			val graph = parser(line)	
			println(ollie(graph))
		}	
	}
}
