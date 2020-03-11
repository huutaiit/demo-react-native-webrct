import { AppRegistry } from 'react-native';
import App2 from './App2';
import SomeTaskName from './SomeTaskName'

AppRegistry.registerComponent('demo2', () => App2);
AppRegistry.registerHeadlessTask('demo2', () => SomeTaskName);
