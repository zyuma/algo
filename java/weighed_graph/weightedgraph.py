import csv

def make_link(G, node1, node2):
    if node1 not in G:
	G[node1] = {}
	(G[node1])[node2] = 1
	if node2 not in G:
		G[node2] = {}
	(G[node2])[node1] = 1
	return G

def read_graph(filename):
    # Read an undirected graph in CSV format. Each line is an edge
	tsv = csv.reader(open(filename), delimiter='\t')
	G = {}
	for (node1, node2) in tsv: make_link(G, node1, node2)
	return G

					
					
# Read the marvel comics graph
marvelG = read_graph('file.tsv')

for i in marvelG:
	if i == 'CAPTAIN AMERICA':
		print i, marvelG[i]
	if i == 'IRON MAN/TONY STARK':
		print i, marvelG[i]

