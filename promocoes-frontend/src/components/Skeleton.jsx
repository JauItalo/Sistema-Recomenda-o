import React from 'react';
import '../css/Skeleton.css';


const Skeleton = ({ width = '100%', height = 20, style = {}}) => (
    <div className="skeleton"
    style={{width, height, ...style}}
    />
);

export default Skeleton;