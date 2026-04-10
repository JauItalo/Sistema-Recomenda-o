import { useState, useEffect } from "react";


export function useAuth() {
    const [token, setToken] = useState(() => localStorage.getItem('token'));

    useEffect(() => {
        if (token) {
            localStorage.setItem('token', token);
        } else {
            localStorage.removeItem('token');
        }

    }, [token]);

    const login = (newToken) => setToken(newToken);
    const logout = () => setToken(null);

    return {
        token,
        isAuthenticated: !!token,
        login,
        logout
    };
}