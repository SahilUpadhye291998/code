function truthCheck(collection, pre) {
    for (let i = 0; i < collection.length; ++i) {
        if (!collection[i][pre]) {
            return false;
        }
    }
    return true;
}

truthCheck(
    [
        { user: "Tinky-Winky", sex: "male" },
        { user: "Dipsy", sex: "" },
        { user: "Laa-Laa", sex: "female" },
        { user: "Po", sex: "female" }
    ],
    "sex"
);
