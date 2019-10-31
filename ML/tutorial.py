# https://elitedatascience.com/python-machine-learning-tutorial-scikit-learn

import numpy as np
import pandas as pd
 
from sklearn.model_selection import train_test_split
from sklearn import preprocessing
from sklearn.ensemble import RandomForestRegressor
from sklearn.pipeline import make_pipeline
from sklearn.model_selection import GridSearchCV
from sklearn.metrics import mean_squared_error, r2_score
import joblib 
 
data = pd.read_csv('winequality-red.csv', sep=';')

# print(data.head())

# print(data.shape)

print(data.describe())

