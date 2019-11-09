#
# https://elitedatascience.com/python-machine-learning-tutorial-scikit-learn
# http://mlr.cs.umass.edu/ml/machine-learning-databases/wine-quality/winequality-red.csv
#

# Import necessary modules

import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn import preprocessing
from sklearn.ensemble import RandomForestRegressor
from sklearn.pipeline import make_pipeline
from sklearn.model_selection import GridSearchCV
from sklearn.metrics import mean_squared_error, r2_score
import joblib 
 
# Read the data and print some stats

data = pd.read_csv('winequality-red.csv', sep=';')

# print(data.describe())

# Split data into training and test

y = data.quality
X = data.drop('quality', axis=1)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=123, stratify=y)
# X_train.to_csv('winequality-red.train.csv', sep=';')
# X_test.to_csv('winequality-red.test.csv', sep=';')

# Scaling data sets

X_train_scaled = preprocessing.scale(X_train)
X_test_scaled = preprocessing.scale(X_test)

# Create and cross-validate pipeline

pipeline = make_pipeline(preprocessing.StandardScaler(), RandomForestRegressor(n_estimators=100))
hyperparameters = { 'randomforestregressor__max_features' : ['auto', 'sqrt', 'log2'], 'randomforestregressor__max_depth': [None, 5, 3, 1]}
clf = GridSearchCV(pipeline, hyperparameters, cv=10)

# Fit model

clf.fit(X_train, y_train)

# Predict new data set

y_pred = clf.predict(X_test)
print("\n", y_pred)

# Evaluate model performance

print("\nR2 Score", r2_score(y_test, y_pred))
print("\nMean error squared", mean_squared_error(y_test, y_pred), "\n")

# Save model for future use

# joblib.dump(clf, 'winequality-red.pkl')

exit()

