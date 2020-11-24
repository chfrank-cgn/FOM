# Big Data and Data Science (9/1/20)
Dr. Marcel Graus, Cambio Analytics GmbH (marcel.graus@fom-net.de)

Big Data:
- Volume (size)
- Velocity (Speed of change)
- Variety (Different forms of data)
- Veracity (Uncertainty of data content)

Big Data Landscape:
- Applications
- Analytics
- Infrastructure

Web Traffic Analysis: Which blog post category will be read most in which country? What should I post to increase followers in the US or UK?

Business Analytics: (Thesis Structure)
- Descriptive (Describe the data)
- Diagnostic (Correlate the data)
- Predictive (Predict future data)
- Preskriptive (Optimization)

## Tableau (9/7/20)

Seminararbeit in Englisch, Themenvorschlag per Slack einreichen

Decision Cycle:
- Collect
- Prepare
- Examine
- Model
- Decide
- Act

*Korrelation ist nicht Kausalität!*

Big Data Introduction:
- Diagnostic Orientation
- Proactive Orientation
- Prescriptive Orientation

Maturity Model:
- Infancy
- Technical Adoption
- Business Adoption
- Enterprise Adoption
- Data & Analytics as a Service

Daten (Bitcom):
- Speichern
- Zugriff
- Inetrpretation
- Verarbeitung
- Visualisierung
- Sicherheit

Data Lake:
- Ingest
- (Store)
- Analysis
- Structure

NoSQL:
- Graph (neo4j)
- Document (MongoDB)
- Column (Cassandra)
- Key-Value (Redis)

[Monte Carlo Simulation](https://www.investopedia.com/terms/m/montecarlosimulation.asp)

Homework: Slides 108, 115, install Tableau

## Machine Learning 1 (9/14/20)
Missing

Homework: Slide 52, prognosis for August; due by 9/29

## Machine Learning 2 (9/15/20)

Missing data - replace with median or mean?

Data split: Train (70%) + Test (20%) + Validation (10% - optional)

Be aware of overfitting!

Avoid dominating values, through standardisation or normalisation.
Rule of thumb: If the data varies a lot, use standardization; otherwise, use normalization

## Graphical Models (9/29/20)

Graph: Nodes + Edges (directed or undirected)

- [Probabilistic Graphical Model](https://towardsdatascience.com/introduction-to-probabilistic-graphical-models-b8e0bf459812) (PGM)
- [Artificial Neural Networks](https://www.investopedia.com/terms/a/artificial-neural-networks-ann.asp) (ANN)
- [Restricted Boltzmann Machines](https://towardsdatascience.com/restricted-boltzmann-machines-simplified-eab1e5878976) (RBM)
- [Hidden Markov Models](https://towardsdatascience.com/introduction-to-hidden-markov-models-cd2c93e6b781) (HMM)

PGM - Bayesian Networks:
- Nodes: Random variables
- Edges: Stochastic dependency
- Graph is directed and acyclic

HMM:
- Markov Property: Only depending on the last point in time, not the whole time series
- Prediction: Going step-by-step from one observation to the next, creating time-series observation data

**Exam:** HMM Problems (see script)

Homework: Slide 30, classification with ANN; due by 10/13

## Hadoop (10/13/20)

Struktur der Hausarbeit:
- Titel
- Einleitung
- Leitfragen oder Hypothesen
- Stand der Forschung
- Theoretische Grundlagen und Methodik
- Untersuchungsgegenstand (Daten bzw. Informationsbasis)
- Ergebnisse
- Fazit, Ausblick
- Literaturverzeichnis, Anhang

**Presentation:** 11/17

Hadoop: "Schema on Read" vs "Schema on Write"  (ETL)

HDFS: Name Nodes and Data Nodes

MapReduce
Input - map() - reduce() - output
map(): split
reduce(): sort - merge

Homework: Slide 51 (MapReduce in Python)

## Text Mining (11/2/20)

Supervised / Unsupervised variables (data)
Labeled / Unlabeled (data)
Abhängige / Unabhängige Variablen

## Text Mining (11/16/20)

[TFIDF](http://www.tfidf.com/) - Term frequency–inverse document frequency

## Revision (11/23/20)

Data is driving change

4V: Volume, Velocity, Validity, Veracity

Data science:
- Domain experts / Subject Matter experts
- Mathematicians
- Computer science engineers / developers

Question: What is a data scientist?

2<sup>nd</sup> platform: Data Warehouse
3<sup>rd</sup> platform: Big Data

Top-Down:
- Theory
- Hypothesis
- Observation
- Confirmation

Bottom-up:
- Observation
- Pattern
- Hypothesis
- Theory

Analysis:
- Descriptive
- Diagnostic
- Predictive
- Prescriptive

Implementation in waves: Diagnostic - Proactive - Prescriptive

Data access, data integration
Move data processing to storage (data lake)

**Exam:** SQL vs NoSQL, comparison: "Unstructured data", "Easy scaling"

Sentiment analysis

Data mining: Tableau, PowerBI, Count

**Exam:** Rossmann data set, churn modelling data set

Preprocessing: Null value, refactor data, combine data

Prediction: Requires preparation!

*"Data wrangling"*

Terminology: Artificial Intelligence - Machine Learning - Deep Learning

Machine Learning: *(pg100)*
- Unsupervised learning
	- Dimensionality
	- Clustering
- Supervised learning
	- Classification
	- Regression
- Reinforcement learning

ML Pipeline:
- Get data
- Clean, prepare, manipulate
- Train model
- Test data
- Improve

**Read:** Algorithms grouped by learning / by simlarity

ML: Preprocessing to enable prediction: How to hande missing data?

*Be aware of overfitting!*

Labeled data: Supervised learning
Unlabeled data: Unsupervised learning

Regression:
- Simple linear regression
- Decision tree
- (k-fold) cross validation
- Hidden Markov-Models

**Exam:** Problems with HMM *(pg 152)*

Hidden Markov Models:
- Computation performance / computational efficiency
- Clustering problems
- Learning step: Getting &lambda; to maximize P(O|&lambda;)

Advanced Neural Networks:
- Limits of two layer approach
- Hidden layer

Hadoop: 
- **Exam:** File system (HDFS) *(pg 178)*
	- Distributed
		- Read process
		- Write process
- MapReduce

MapReduce: Split - sort - merge
**Exam:** Explain examples *(pg 188-190)*

MapReduce -> Spark (on top of HDFS) "in-memory data" *(pg 197)*

Text mining - subset of data mining - structured / semi-structured data
- Unsupervised learning
- Can potentially lead to interesting supervised learning

### Document clustering
Challenges: Multi-dimensionality - IDF - TF-IDF

Exam: How to determine if documents are similar? 
- Distance of Vectors -> Calculate the angle *(pg238)*

Hierarchical clustering algorithms -> Analysis

### Document classification

Labeled data? *(pg 244)*
Collection:
- Preprocessing, remove stop words
- Indexing (TF-IDF / feature generation)
- **Exam:** Feature selection
- Classification
- Performance evaluation

Tools: [KNIME](https://www.knime.com/), [Rapid Miner](https://rapidminer.com/)

Web mining:
- Ethical questions
- Legal questions (e.g. GDPR, CCPA)

Web scraping: Selector gadget

### Natural language processing

- Preference graph
- Phrase-based translation

### Concept extraction

Text mining into a concept map 
(ACE: Automatic Concept Extraction / KEA: Automatic Keyphrase Extraction)

### HMM

**Exam:** Time-series data: O<sub>t</sub> - observation at a given time 
Hidden state / hidden structure: Markov chain *(pg 150 ff)*


<!--stackedit_data:
eyJoaXN0b3J5IjpbNTg5OTkxNDU1LDE1NTc5NjkwMDksLTM1Mz
kyNTQ3Myw1NjU3MzM3NjgsLTE0OTU0MzAxNzYsMTY2NDg4Njk1
NSwtOTU1NDU2MzA3LDk1MDE3MDMwMSwxNTA4MzcyMDk5LC0yOD
EzNjIyMjcsMTk1MDcxNzU0OCwxNTc1MjM0MzA3LDEzMjU4Mzk4
OTcsNjg0MjI0NjUyLC0yMDM5NDg3MDU0LC0yNTE3OTc3MywtOD
Y2MzIwODZdfQ==
-->