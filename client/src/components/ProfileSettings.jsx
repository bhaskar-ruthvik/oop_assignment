import React, { useState,useEffect } from 'react'
import Button from '@mui/material/Button'
import Stack from '@mui/material/Stack'
import Box from '@mui/material/Box'
// import Link from '@mui/material/Link'
import {BsGlobe} from 'react-icons/bs'
import {AiOutlineMenu} from 'react-icons/ai';
import { IoCartOutline } from 'react-icons/io5'
import { FaRegUserCircle } from 'react-icons/fa';
import { flexCenter } from '../themes/commonStyles';
import {Link} from 'react-router-dom'

const ProfileSettings = () => {

  const[signIn,setSignIn] = useState(window.localStorage.getItem("signin"));

  
  return (
    <Box sx={flexCenter}>
    {signIn ? <Link to="/signout">Sign Out</Link>: <Link to="/signup/customer"> Become A User</Link>}
    <Stack>
    
        <Link to="/cart"><Button>
            <IoCartOutline size={24} />
        </Button>
        </Link>
        <Button 
        sx={{
            borderRadius: 10, border: '1px solid #ddd'
        }}>
        <Stack>
            <AiOutlineMenu size={24}/>
            <FaRegUserCircle size={24}/>
        </Stack>

        </Button>
    </Stack>
    </Box>
  )
}

export default ProfileSettings