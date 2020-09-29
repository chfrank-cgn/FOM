# Big Data and Data Science (9/1/20)
Dr. Marcel Graus, Cambio Analytics GmbH

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


<!--stackedit_data:
eyJoaXN0b3J5IjpbNjg0MjI0NjUyLC0yMDM5NDg3MDU0LC0yNT
E3OTc3MywtODY2MzIwODZdfQ==
-->