import RNCallKeep from 'react-native-callkeep';

const displayIncomingCall = (number) => {
    const callUUID = getNewUuid();
    addCall(callUUID, number);

    log(`[displayIncomingCall] ${format(callUUID)}, number: ${number}`);

    RNCallKeep.displayIncomingCall(callUUID, number, number, 'number', false);
};
module.exports = async (taskData) => {
    // alert("Sdfds");
    // console.log('test');
    // displayIncomingCall()
}